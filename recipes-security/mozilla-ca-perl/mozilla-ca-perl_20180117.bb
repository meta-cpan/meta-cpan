DESCRIPTION = "Mozilla::CA provides a copy of Mozilla's bundle of Certificate Authority \
certificates in a form that can be consumed by modules and libraries based \
on OpenSSL."

SECTION = "libs"
LICENSE = "MPLv2"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Mozilla-CA"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MPL-2.0;md5=815ca599c9df247a0c7f619bab123dad"

SRC_URI = "https://cpan.metacpan.org/authors/id/A/AB/ABH/Mozilla-CA-20180117.tar.gz"

SRC_URI[md5sum] = "9c93333e1d9d3fad639e9d4082898de1"
SRC_URI[sha256sum] = "f2cc9fbe119f756313f321e0d9f1fac0859f8f154ac9d75b1a264c1afdf4e406"

S = "${WORKDIR}/Mozilla-CA-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
