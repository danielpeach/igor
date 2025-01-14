package com.netflix.spinnaker.igor.jenkins.client.model

import org.simpleframework.xml.Root

/**
 * Represents a Jenkins job downstream project
 */
@Root(name = 'downstreamProject', strict=false)
class DownstreamProject extends RelatedProject {
}
