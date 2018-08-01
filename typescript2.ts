
class Mouse{

    constructor(private a?: number, private y?: number){
       this.a = a;
       this.y = y;
    }

    addElements(){
        console.log("X is "+this.a +" Y is "+this.y+" sum is "+(this.a+this.y));
    }

    get X(){
        return this.a;
    }
    set X(value){
        if(value<0){
            throw new Error("value cannot be less than Zero");
        }
        else this.a = value;
    }
}

let obj = new Mouse(2,5);
obj.X =-5;
var d = obj.X;
console.log(d);
obj.addElements();