DESCRIPTION = "This module first checks to see if either Cpanel::JSON::XS or JSON::XS is \
already loaded, in which case it uses that module. Otherwise it tries to \
load Cpanel::JSON::XS, then JSON::XS, then JSON::PP in order, and either \
uses the first module it finds or throws an error."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/JSON-MaybeXS"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/H/HA/HAARG/JSON-MaybeXS-1.004000.tar.gz"

SRC_URI[md5sum] = "db61fb5515f8e2f19709a317e26dde42"
SRC_URI[sha256sum] = "59bda02e8f4474c73913723c608b539e2452e16c54ed7f0150c01aad06e0a126"
RRECOMMENDS_${PN} += "cpanel-json-xs-perl"

S = "${WORKDIR}/JSON-MaybeXS-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
