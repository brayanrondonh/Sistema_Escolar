(function()
{
	function filePreview1(input)
	{
		if(input.files && input.files[0])
		{
			var reader = new FileReader();

			reader.onload = function(e)
			{
				$('#vista_previa1').html("<img src='"+e.target.result+"'/>");
			}
			reader.readAsDataURL(input.files[0]);
		}
	}

	$('#btn_imagen1').change(function()
	{
		filePreview1(this);
	})



	function filePreview2(input)
	{
		if(input.files && input.files[0])
		{
			var reader = new FileReader();

			reader.onload = function(e)
			{
				$('#vista_previa2').html("<img src='"+e.target.result+"'/>");
			}
			reader.readAsDataURL(input.files[0]);
		}
	}

	$('#btn_imagen2').change(function()
	{
		filePreview2(this);
	})
})();