#!/usr/bin/env groovy
package com.cleverbuilder

class EmailNotification {
  static def consoleParser() {
                    logParser parsingRulesPath: '/var/lib/jenkins/log_rules/config', projectRulePath: '', useProjectRule: false
                    // Send an email only if the build has failed
                    emailext subject: '$DEFAULT_SUBJECT' ,
                        body: '$DEFAULT_CONTENT',
                        recipientProviders: [
                            [$class: 'CulpritsRecipientProvider'],
                            [$class: 'DevelopersRecipientProvider'],
                            [$class: 'RequesterRecipientProvider']
                        ],
                        replyTo: '$DEFAULT_REPLYTO',
                        to: '$DEFAULT_RECIPIENTS'
            }
}
