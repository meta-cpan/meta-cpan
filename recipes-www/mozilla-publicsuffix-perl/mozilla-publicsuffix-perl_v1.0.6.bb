DESCRIPTION = "This module provides a single function that returns the *public suffix* of \
a domain name by referencing a parsed copy of Mozilla's Public Suffix List. \
From the official website at <http://publicsuffix.org/>:"

SECTION = "libs"
LICENSE = "MIT"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Mozilla-PublicSuffix"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "https://cpan.metacpan.org/authors/id/T/TO/TOMHUKINS/Mozilla-PublicSuffix-v1.0.6.tar.gz"

SRC_URI[md5sum] = "32c65a1e13385a8138e6382ad72b21c7"
SRC_URI[sha256sum] = "a3bc115d6a59fb7bf23b539fb7b95e4ee06850fab884e2d12dd98dc545f9ebd8"
RDEPENDS:${PN} += "uri-perl"
DEPENDS += "module-build-perl-native"
DEPENDS += "uri-perl-native"

S = "${WORKDIR}/Mozilla-PublicSuffix-${PV}"

inherit cpan_build allarch

BBCLASSEXTEND = "native"
