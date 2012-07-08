class sphere(val a:Double,val b:Double,val c:Double,val r:Double,val x0:Double,val y0:Double, val z0:Double, val xd:Double, val yd:Double, val zd:Double) {  
  def intersection = {
       val disc = (r-x0-y0-z0+a+b+c)/(3*xd*yd*zd) //discriminant.... I think
        if(disc<0){
         println("No intercection")
         println(disc)
        } else {
           println("Intercection")
          println(disc)
          val xi = x0+xd*disc // x y and z of intercection point
          val yi = y0+yd*disc 
          val zi = z0+zd*disc
          val Ri = (xi,yi,zi)
          println("intercection point is "+xi+","+yi+","+zi)
        } 
      } 
    } 
   
   
object something {
    def main(args: Array[String]) {
      while(true){
        println("\nSphere or Plane?")
        val input = readLine()
          if(input=="Sphere"||input=="sphere"){
      		println("Enter x coordinate")
      		val a = readDouble()
      		println("Enter y coordinate")
      		val b = readDouble()
      		println("Enter z coordinate")
      		val c = readDouble()
      		println("Enter radius")
      		val r = readDouble()
      		println("Enter ray starting x")
      		val x0 = readDouble()
      		println("Enter ray starting y")
      		val y0 = readDouble()
      		println("Enter ray starting z")
      		val z0 = readDouble()
      		println("Enter ray x component")
      		val xd = readDouble()
      		println("Enter ray y component")
      		val yd = readDouble()
      		println("Enter ray z component")
      		val zd = readDouble()
      		val Blah = new sphere(a,b,c,r,x0,y0,z0,xd,yd,zd)
      		Blah.intersection
     
    	  } else if(input=="Plane"||input=="plane") {
    	    println("PLANE YEAAHH!!!!!")
    	  } else println("Do not understand")
       }	  
    }
}
