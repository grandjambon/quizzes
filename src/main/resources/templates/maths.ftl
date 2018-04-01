<!DOCTYPE html>

<#import "lib/utils.ftl" as u>
<@u.page>
    <center>
    <table cellpadding="10" style="border-collapse: collapse; table-layout: fixed; font-family: monospace;" width=100%>
        <#list maths as question>
            <#if question?is_even_item>
                    <td align="left" style="border: 1px solid #ccccff; border-collapse:collapse; background-color: white" width=50%>${question.stringValue}</td>
                </tr>
            <#else>
                <tr>
                    <td align="left" style="border: 1px solid #ccccff; border-collapse:collapse; background-color: white" width=50%>${question.stringValue}</td>
            </#if>
        </#list>
    </center>
</@u.page>