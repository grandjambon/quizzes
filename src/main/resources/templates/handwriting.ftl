<!DOCTYPE html>

<#import "lib/utils.ftl" as u>
<@u.page>
    <center>
    <table cellpadding="10" style="border-collapse: collapse; table-layout: fixed; font-family: monospace;" width=100%>
        <#list letters as letter>
            <tr>
                <td align="left" style="border: 1px solid #ccccff; border-collapse:collapse; background-color: white; color" width=80%><font size="16" color="#f2f2f2">${letter.letter}    ${letter.letter}    ${letter.letter}    ${letter.letter}    ${letter.letter}     ${letter.word}</font></td>
            </tr>
        </#list>
    </center>j
</@u.page>