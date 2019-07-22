
class Folder {
def getContent(path:String)={
  val folderHere = (new java.io.File(path)).listFiles

for(file<-folderHere) {
  println(file)
  }
}
}
object file extends App{
  val folder=new Folder()
  folder.getContent("/home/knoldus/GivenFolder")
}
