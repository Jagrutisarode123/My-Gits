function checkFirstName()
{
    var name= document.getElementById("first_name").value
    if(name=="")
  {
    document.getElementById("Msg1").style.color="Blue"
    document.getElementById("Msg1").innerHTML="Please Enter the name first"
  }
  /^ [a-zA-Z]$/
}