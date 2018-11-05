DESCRIPTION = "Check POD files for errors or warnings in a test file, using "Pod::Simple" \
to do the heavy lifting."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Test-Pod"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/E/ET/ETHER/Test-Pod-1.52.tar.gz"

SRC_URI[md5sum] = "472dda77746d48e6465bf62e47aeca81"
SRC_URI[sha256sum] = "60a8dbcc60168bf1daa5cc2350236df9343e9878f4ab9830970a5dde6fe8e5fc"

S = "${WORKDIR}/Test-Pod-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
