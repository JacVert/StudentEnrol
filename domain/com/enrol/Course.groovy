package com.enrol

class Course {

   String department
   String courseTitle
   String courseLeader
   String courseCode
   Date startDate
   Date endDate
   String description
   int numberOfStudents
   double tuitionFees
   String studyMode

 static constraints = {
   
   courseTitle(blank:false, nullable:false)
   department(blank:false, nullable:false)
   courseLeader(blank:false, nullable:false)
   courseCode(blank:false, nullable:false)
   numberOfStudents(blank:false, nullable:false, size:20..60)
   startDate(blank:false, nullable:false)
   endDate(blank:false)
   studyMode(blank:false, nullable:false, maxSize:25)
   description(blank:false, nullable:false, maxSize:5000, wdiget:'textarea')
   tuitionFees(blank:false, nullable:false)
   
 }
}
