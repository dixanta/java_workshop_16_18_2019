<?php
class Student{
    private $id;
    private $name;
    private $status;

    public function __construct(){

    }

    public function setId($id){
        $this->id=$id;
    }

    public function setName($name){
        $this->name=$name;
    }
}

$student=new Student();
$student->setId(1);
$student->setName("Mukesh");

print_r($student);

