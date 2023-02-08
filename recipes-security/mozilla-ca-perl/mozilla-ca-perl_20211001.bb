DESCRIPTION = "Mozilla::CA provides a copy of Mozilla's bundle of Certificate Authority \
certificates in a form that can be consumed by modules and libraries based \
on OpenSSL."

SECTION = "libs"
LICENSE = "MPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Mozilla-CA"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MPL-2.0;md5=815ca599c9df247a0c7f619bab123dad"

SRC_URI = "https://cpan.metacpan.org/authors/id/A/AB/ABH/Mozilla-CA-20211001.tar.gz"

SRC_URI[md5sum] = "843e42f367ea3c7abc5de5b6225791dc"
SRC_URI[sha256sum] = "122c8900000a9d388aa8e44f911cab6c118fe8497417917a84a8ec183971b449"

S = "${WORKDIR}/Mozilla-CA-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
