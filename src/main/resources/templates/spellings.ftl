<!DOCTYPE html>

<#import "lib/utils.ftl" as u>
<@u.page>
    <center>
    <p>For each word, write a sentence that contains it:</p>
    <table cellpadding="10" style="border-collapse: collapse; table-layout: fixed; font-family: monospace;" width=100%>
        <#list spellings as spelling>
            <tr>
                <td align="center" style="border: 1px solid #ccccff; border-collapse:collapse; background-color: white" width=20%>${spelling}</td>
                <td align="center" style="border: 1px solid #ccccff; border-collapse:collapse; background-color: white" width=80%></td>
            </tr>
        </#list>
    </center>
</@u.page>