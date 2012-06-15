<%@ page import="com.iai.Vehicle" %>



<div class="fieldcontain ${hasErrors(bean: vehicleInstance, field: 'make', 'error')} required">
	<label for="make">
		<g:message code="vehicle.make.label" default="Make" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="make" required="" value="${vehicleInstance?.make}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: vehicleInstance, field: 'year', 'error')} required">
	<label for="year">
		<g:message code="vehicle.year.label" default="Year" />
		<span class="required-indicator">*</span>
	</label>
	<g:field type="number" name="year" required="" value="${vehicleInstance.year}"/>
</div>
<fieldset class="embedded"><legend><g:message code="vehicle.model.label" default="Model" /></legend>
<div class="fieldcontain ${hasErrors(bean: vehicleInstance, field: 'model.engine', 'error')} ">
	<label for="model.engine">
		<g:message code="vehicle.model.engine.label" default="Engine" />
		
	</label>
	<g:textField name="engine" value="${vehicleModelInstance?.engine}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: vehicleInstance, field: 'model.id', 'error')} required">
	<label for="model.id">
		<g:message code="vehicle.model.id.label" default="Id" />
		<span class="required-indicator">*</span>
	</label>
	<g:field type="number" name="id" required="" value="${vehicleModelInstance.id}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: vehicleInstance, field: 'model.name', 'error')} required">
	<label for="model.name">
		<g:message code="vehicle.model.name.label" default="Name" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="name" required="" value="${vehicleModelInstance?.name}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: vehicleInstance, field: 'model.packageName', 'error')} ">
	<label for="model.packageName">
		<g:message code="vehicle.model.packageName.label" default="Package Name" />
		
	</label>
	<g:textField name="packageName" value="${vehicleModelInstance?.packageName}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: vehicleInstance, field: 'model.version', 'error')} required">
	<label for="model.version">
		<g:message code="vehicle.model.version.label" default="Version" />
		<span class="required-indicator">*</span>
	</label>
	<g:field type="number" name="version" required="" value="${vehicleModelInstance.version}"/>
</div>
</fieldset>
