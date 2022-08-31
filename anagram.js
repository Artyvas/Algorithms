/**
 * @param {string} s
 * @param {string} t
 * @return {boolean}
 */
 var isAnagram = function(s, t) {
  if (!(s.length === t.length)) {
    return false;
  }

  let hashMapS = {};
  let hashMapT = {};
  let splitStrS = s.toLowerCase().split("");
  let splitStrT = t.toLowerCase().split("");

  for (let i = 0; i < splitStrS.length; i++) {
      if(!hashMapS[splitStrS[i]]){
          hashMapS[splitStrS[i]] = 1;
      } else {
        hashMapS[splitStrS[i]] += 1;
      }
  }

for (let i = 0; i < splitStrT.length; i++) {
      if(!hashMapT[splitStrT[i]]){
          hashMapT[splitStrT[i]] = 1;
      } else {
        hashMapT[splitStrT[i]] += 1;
      }
  }

  for (let i = 0; i < splitStrT.length; i++) {
    if(!(hashMapS[splitStrT[i]] === hashMapT[splitStrT[i]])){
      return false
    }
  }
return true  
};