/**
 * @param {string} s
 * @param {string} t
 * @return {boolean}
 */
var isAnagram = function (s, t) {
  const santizedText1 = s.replace("/[^a-zA-Z0-9]/g", "").toLowerCase();
  const santizedText2 = t.replace("/[^a-zA-Z0-9]/g", "").toLowerCase();

  const sortedText1 = santizedText1.split("").sort().join();
  const sortedText2 = santizedText2.split("").sort().join();

  return sortedText1 === sortedText2;
};

console.log(isAnagram("arc", "car"));
