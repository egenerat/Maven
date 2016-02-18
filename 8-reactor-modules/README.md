
    --resume-from - resumes a reactor the specified project (e.g. when it fails in the middle)
    --also-make - build the specified projects, and any of their dependencies in the reactor
    --also-make-dependents - build the specified projects, and any that depend on them
    --fail-fast - the default behavior - whenever a module build fails, stop the overall build immediately
    --fail-at-end - if a particular module build fails, continue the rest of the reactor and report all failed modules at the end instead
    --non-recursive - do not use a reactor build, even if the current project declares modules and just build the project in the current directory