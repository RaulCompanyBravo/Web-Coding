<!DOCTYPE html>
<html>
<?php 
 $menu = array(
                "1" => array (
                                "title" => 'Home',
                                "page"  => 'home', 
                                "url"   => "../content/home.php"
                                        ),
                "2" => array (
                                "title" => "Our Services",
                                "page"  => 'services',
                                "url"   => "../content/services.php"            
                                        ),                                      
                "3" => array (
                                "title" => 'Portfolio',
                                "page"  => 'portfolio',
                                "url"   => "../content/portfolio.php"           
                                        ),
                "4" => array (
                                "title" => 'About',
                                "page"  => 'about',
                                "url"   => "../content/about.php"               
                                        ),                      
                "5" => array (
                                "title" => 'Contact',
                                "page"  => 'contact',
                                "url"   => "../content/contact.php"             
                                        )
);
?> 

<ul>
<?php
	for ($i = 1; $i <= count($menu); $i++)
	{
		echo '<li><a href="#">' . $menu[$i]['title'] . '</a></li>';
	}
?>
</ul>

</html>
git add --all