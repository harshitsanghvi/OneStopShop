function unameValidation() {
	var uname = $("#uname").value;
	if (uname === "") {
		alert("Username cannot be blank.");
		$("#uname").focus();
	}
}

function passwordValidation() {
	var password = $("#password").value;
	if (password === "") {
		alert("Password cannot be blank.");
		$("#uname").focus();
	}
}