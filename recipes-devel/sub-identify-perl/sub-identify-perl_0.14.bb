DESCRIPTION = ""Sub::Identify" allows you to retrieve the real name of code references."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Sub-Identify"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/R/RG/RGARCIA/Sub-Identify-0.14.tar.gz"

SRC_URI[md5sum] = "014f19e72698b6a2cbcb54adc9691825"
SRC_URI[sha256sum] = "068d272086514dd1e842b6a40b1bedbafee63900e5b08890ef6700039defad6f"

S = "${WORKDIR}/Sub-Identify-${PV}"

inherit cpan

BBCLASSEXTEND = "native"
