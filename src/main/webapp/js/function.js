var flag = true;
hide = function(li){
	var a = li.getElementsByTagName("ul")[0];
	a.style.display = "none";
}
show = function(li){
	var a = li.getElementsByTagName("ul")[0];
	a.style.display = "block";
}
clickMenu = function(li){
	var a = li.getElementsByTagName("ul")[0];
	if (flag)
	{
		a.style.display = "block";
		flag = false;
	}
	else
	{
		a.style.display = "none";
		flag = true;
	}
}
