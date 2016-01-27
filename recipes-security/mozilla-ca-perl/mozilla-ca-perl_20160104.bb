DESCRIPTION = "Mozilla::CA provides a copy of Mozilla's bundle of Certificate Authority \
certificates in a form that can be consumed by modules and libraries based \
on OpenSSL."

SECTION = "libs"
LICENSE = "MPLv2"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Mozilla-CA"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MPL-2.0;md5=815ca599c9df247a0c7f619bab123dad"

SRC_URI = "https://cpan.metacpan.org/authors/id/A/AB/ABH/Mozilla-CA-20160104.tar.gz"

SRC_URI[md5sum] = "1b91edb15953a8188f011ab5ff433300"
SRC_URI[sha256sum] = "27a7069a243162b65ada4194ff9d21b6ebc304af723eb5d3972fb74c11b03f2a"

S = "${WORKDIR}/Mozilla-CA-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
