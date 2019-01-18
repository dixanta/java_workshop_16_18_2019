function kmp(text, pattern) {
    var tlen = text.length;
    var plen = pattern.length;

    var i = 0, j = 0, counter = 0, index = 0;
    while (i < (tlen)) {
        
        if (text.charAt(i) == pattern.charAt(j)) {
            
            i++;
            j++;
            if (j == plen) {
                //console.log("match");
                counter++;
                j = 0;
                index = i-1;
                //console.log(text.charAt(i));
                //console.log(index);
            }
        } else {
            //console.log("test");
            //console.log(index);
            i = ++index;
            j = 0;
        }
    }
    return counter;
}

var fs=require('fs');

fs.readFile("data1.txt",(err,data)=>{
    console.log(new Date());
    console.log(kmp(data.toString().toLowerCase(),"node".toLowerCase()));
    console.log(new Date());
});



