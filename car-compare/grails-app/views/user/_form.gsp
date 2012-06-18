<%@ page import="com.iai.User" %>



<div class="fieldcontain ${hasErrors(bean: userInstance, field: 'comparisons', 'error')} ">
	<label for="comparisons">
		<g:message code="user.comparisons.label" default="Comparisons" />
		
	</label>
	
<ul class="one-to-many">
<g:each in="${userInstance?.comparisons?}" var="c">
    <li><g:link controller="comparison" action="show" id="${c.id}">${c?.encodeAsHTML()}</g:link></li>
</g:each>
<li class="add">
<g:link controller="comparison" action="create" params="['user.id': userInstance?.id]">${message(code: 'default.add.label', args: [message(code: 'comparison.label', default: 'Comparison')])}</g:link>
</li>
</ul>

</div>

<div class="fieldcontain ${hasErrors(bean: userInstance, field: 'name', 'error')} ">
	<label for="name">
		<g:message code="user.name.label" default="Name" />
		
	</label>
	<g:textField name="name" value="${userInstance?.name}" />
</div>

<div class="fieldcontain ${hasErrors(bean: userInstance, field: 'password', 'error')} ">
	<label for="password">
		<g:message code="user.password.label" default="Password" />
		
	</label>
	<g:textField name="password" value="${userInstance?.password}" />
</div>

<div class="fieldcontain ${hasErrors(bean: userInstance, field: 'totalComparisons', 'error')} ">
	<label for="totalComparisons">
		<g:message code="user.totalComparisons.label" default="Total Comparisons" />
		
	</label>
	<g:field type="number" name="totalComparisons" value="${userInstance.totalComparisons}" />
</div>

