const fs = require("fs");
const _input = fs.readFileSync(0, "utf-8").toString().trim().split(/\r?\n/g);
let _idx = 0;
const rdline = () => _input[_idx++];

let [a, b] = rdline().split(" ").map(Number);
console.log(a + b);
