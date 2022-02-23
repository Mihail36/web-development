<?php
$text=$_GET['identifier'];
if (ctype_alnum($text) and !is_numeric($text[0])) {
  echo 'yes';
} else {
    if (is_numeric($text[0])){
      echo 'no, identifier must be start only on letters';
    } else {
        echo 'no, identifier must contain letters and numbers';
    }
}


  