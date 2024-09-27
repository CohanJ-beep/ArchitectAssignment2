<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>File Upload for Schedule:</title>
</head>
<body>

<form method="post" action="fileuploadservlet" enctype="multipart/form-data">
    <input type="file" name="file" />
    <input type="submit" value="Upload" />
</form>

<!-- HTML5 Input Form Elements -->
<input id="ajaxfile" type="file"/> <br/>
<button onclick="uploadFile()"> Upload </button>

<!-- Ajax to Java File Upload Logic -->
<script>
    async function uploadFile() {
        let formData = new FormData();
        formData.append("file", ajaxfile.files[0]);
        await fetch('fileuploadservlet', {
            method: "POST",
            body: formData
        });
        alert('The file upload with Ajax and Java was a success!');
    }
</script>
</body>
</html>