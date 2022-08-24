var reverseWords = function(s) {
  let resultArr = [];
  let wordSplit = s.split(" ");
  for (let i = 0; i < wordSplit.length;i++){
    let tempArr = wordSplit[i];
    splitArr = tempArr.split("");
    revArr = splitArr.reverse();
    revStr = revArr.join("");
    resultArr.push(revStr);
  }
  let finalArr = resultArr.join(" ");
  return finalArr;
};