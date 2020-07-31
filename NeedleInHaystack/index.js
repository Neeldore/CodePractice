//https://leetcode.com/problems/implement-strstr/

/**
 * @param {string} haystack
 * @param {string} needle
 * @return {number}
 */
var strStr = function (haystack, needle) {
  let lookUp = {};
  let alen = haystack.length;
  let blen = needle.length;
  if (blen === 0) return 0;
  if (alen === 0) return -1;
  for (let i = 0; i < alen - blen + 1; i++) {
    let subStr = haystack.substring(i, i + blen);
    if (lookUp[subStr] !== undefined) continue;
    lookUp[haystack.substring(i, i + blen)] = i;
  }
  return lookUp[needle] !== undefined ? lookUp[needle] : -1;
};

console.log(strStr('aaa', 'a'));
