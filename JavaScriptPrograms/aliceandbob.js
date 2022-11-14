process.stdin.resume();
process.stdin.setEncoding('utf8');
let n = parseInt(prompt());
for (var i = 0; i < n; i++) {
  let l = parseInt(prompt());
  let loop=l;
  let S = prompt();
  let T = "";
  let flag = 0;
  let j = 0;
  while (loop != 0) {
    if (flag == 0) {
      let alice = S.charAt(j);
      j++;
      if(alice==1)
      T=T+alice;
      else
        T=alice+T;
      flag = 1;
    }
    else {
      let bob = S.charAt(l - 1);
      --l;
      if(bob==1)
        T=bob+T;
      else
        T=T+bob;
      flag = 0;
    }
      --loop;
  }
  console.log(T);
}