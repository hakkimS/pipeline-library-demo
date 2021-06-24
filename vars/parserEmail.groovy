def email_error() {
 logParser parsingRulesPath: '/var/lib/jenkins/log_rules/config', projectRulePath: '', useProjectRule: false
                    // Send an email only if the build has failed
}
