DESCRIPTION = "How many times have you found yourself writing:"

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Safe-Isa"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/E/ET/ETHER/Safe-Isa-1.000010.tar.gz"

SRC_URI[md5sum] = "f68579f6acfeb2e19d7d9a65100399d8"
SRC_URI[sha256sum] = "87f4148aa0ff1d5e652723322eab7dafa3801c967d6f91ac9147a3c467b8a66a"

S = "${WORKDIR}/Safe-Isa-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
