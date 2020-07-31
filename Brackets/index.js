var start = ["(", "{", "["];
var end = [")", "}", "]"];
var isValid = function (s) {
  let ar = [];
  let isValid = true;
  for (let str of s) {
    let mainInt = end.indexOf(str);
    if (mainInt === -1) {
      ar.push(str);
    } else {
      let pu = ar.pop();
      if (start.indexOf(pu) !== mainInt) {
        return false;
      }
    }
  }
  if (ar.length) return false;
  return true;
};

console.log(isValid("{[]}"));
