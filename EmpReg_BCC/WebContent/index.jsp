<%@taglib uri="http://www.springframework.org/tags/form" prefix="html" %>

 <html:form commandName="form">
 <pre>'
 <html:errors></html:errors>
NAME:<html:input path="name"/>
EMAIL:<html:input path="email"/>
 		<input type="submit" value="Submit"/>
 
 </pre>
 </html:form>