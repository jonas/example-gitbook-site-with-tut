# example-gitbook-site-with-tut

You must have [Gitbook CLI](https://github.com/GitbookIO/gitbook-cli) installed.

You should also have [node.js](https://nodejs.org/en/download/package-manager/) installed.

If you try running "makeSite" by itself, it will complain about missing files.  You must run "tut" first.

```
sbt ";tut; makeSite"
```