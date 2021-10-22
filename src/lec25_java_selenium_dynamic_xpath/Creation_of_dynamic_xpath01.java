package lec25_java_selenium_dynamic_xpath;


/*
 
 Different ways to create dynamic Xpath:

1. Tag with a single attribute.
 
Formula:
 //htmltag[@attributeName='attributeValue']

Source: 
https://www.amazon.com

Example: 
i) search field --->  //input[@id='twotabsearchtextbox']
ii) submit button --->  //input[@id='nav-search-submit-button']
iii) logo ---> //a[@class='nav-logo-link nav-progressive-attribute']

Source: 
https://portaldev.cms.gov/portal/

Example:
i) logo ---> //a[@id='cms-homepage-link']
  
2. Tag with multiple attribute with 'or' logic (not used much)
 
Formula:
//html tag [@attribute name = 'attribute value' or @attribute name = 'attribute value']

Source:
https://www.bestbuy.com/

Example:
i) search field ---> //input[@id='gh-search-input' or @class='search-input']

3) Tag with multiple attribute with 'and' logic

Formula:
//html tag [@attribute name = 'attribute value' and @attribute name = 'attribute value']

Source:
https://portaldev.cms.gov/portal/

Example:
i) logo ---> //input[@class='cms-login-field ng-pristine ng-invalid ng-touched' and @id='cms-login-password']

4) Tag with inner text [means complete text]

Formula:
//html tag [text() = 'inner text value' ]

Source:
https://www.amazon.com

Example:
i) find a gift ---> //a[text()='Find a Gift']

Source:
https://www.bestbuy.com/

Example:
i) Deal of the Day---> //a[text()='Deal of the Day']

 
 */



public class Creation_of_dynamic_xpath01 {

}
