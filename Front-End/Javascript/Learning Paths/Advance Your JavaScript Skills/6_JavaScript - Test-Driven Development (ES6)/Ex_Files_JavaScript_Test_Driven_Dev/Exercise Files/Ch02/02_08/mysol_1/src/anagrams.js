/* import { isEqual } from 'lodash';
import { getLetterCount } from './letter-count';

export const formatString = string =>
    string.toLowerCase().replace(/\s+/g, '');

export const isAnagram = (string1, string2) => {
    const string1LetterCount = getLetterCount(formatString(string1));
    const string2LetterCount = getLetterCount(formatString(string2));

    return isEqual(string1LetterCount, string2LetterCount);
}; */


export const isAnagram = (string1, string2) => {
  let str1 = string1.replace(/\s+/g, '');
  let str2 = string2.replace(/\s+/g, '');
  if (str1.length !== str2.length) {
    return false;
  }
  let counter = new Array(26).fill(0);

  for(let i = 0; i < str1.length; i++) {
    counter[str1.charCodeAt(i) - 97]++;
    counter[str2.charCodeAt(i) - 97]--;
  }

  for(let count of counter) {
      if(count != 0) {
          return false;
      }
  }

  return true;
};

