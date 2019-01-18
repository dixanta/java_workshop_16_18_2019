class Student:
    def __init__(self):
        self.id=0
        self.name=""
        self.status=False

    def toString(self):
        return ("%d %s") % (self.id,self.name)



student=Student()

student.id=1
student.name="asdfasd"

print(student.toString())