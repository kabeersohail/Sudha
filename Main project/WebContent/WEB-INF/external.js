function validate_form(thisform)
{ with(thisform)
	{
	if(validate_required(email,"email cannot be empty")== false)
		{
		email.focus();
		return false;
		
		}
	else
return true;
	}
}
function validate_required(field,text)
{
	with(field)
	{
		if(value==null || value=="") {
			alert(text);
			return false;
		}
		else
			{
			return true;
			}
		}
}


	
			
		