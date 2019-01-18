export class Student{
    private id:number;
    private name:string;
    private status:boolean;

    constructor(id:number,name:string,status:boolean){
        this.id=id;
        this.name=name;
        this.status=status;
    }

    public getId():number{
        return this.id;
    }

    public getName():string{
        return this.name;
    }

    public getStatus():boolean{
        return this.status;
    }
}