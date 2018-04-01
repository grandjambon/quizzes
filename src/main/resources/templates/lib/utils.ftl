<#macro page>
    <#import "/spring.ftl" as spring />
    <html lang="en">
        <head>
            <link rel="stylesheet" type="text/css" href="<@spring.url '/quizzes.css'/>"/>
            <style>
        </head>
        <body bgcolor="white">
            <div class="flex-container"/>
                <header><p class="monospace">Quizzes!</p></header>
                <article class="article">
                    <#nested>
                </article>
             </div>
        </body>
    </html>
</#macro>