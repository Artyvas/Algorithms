var lengthOfLastWord = function(s) {
  let trimStr = s.trim();
  let tempArray = trimStr.split(" ");
  let lastWord = tempArray[tempArray.length - 1];
  let lastWordArr = lastWord.split("");
  console.log(lastWordArr);
  
  return lastWordArr.length
};