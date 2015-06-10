DESCRIPTION = "Test::Time can be used to test modules that deal with time. Once you \
\"use\" this module, all references to \"time\" and \"sleep\" will be \
internalized."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Test-Time"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "http://cpan.metacpan.org/authors/id/S/SA/SATOH/Test-Time-0.04.tar.gz"

SRC_URI[md5sum] = "006c4b2134f33d8dc98ecf545d4f8508"
SRC_URI[sha256sum] = "d8c1bc57f9767ae8122fc4ab873bd991cb9ea8e9422c66399acb66770fa5c2ea"

S = "${WORKDIR}/Test-Time-${PV}"

inherit cpan

BBCLASSEXTEND = "native"
