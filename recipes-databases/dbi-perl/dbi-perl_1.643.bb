DESCRIPTION = "The DBI is a database access module for the Perl programming language. It \
defines a set of methods, variables, and conventions that provide a \
consistent database interface, independent of the actual database being \
used."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/DBI"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/T/TI/TIMB/DBI-1.643.tar.gz"

SRC_URI[md5sum] = "352f80b1e23769c116082a90905d7398"
SRC_URI[sha256sum] = "8a2b993db560a2c373c174ee976a51027dd780ec766ae17620c20393d2e836fa"

S = "${WORKDIR}/DBI-${PV}"

inherit cpan

BBCLASSEXTEND = "native"
