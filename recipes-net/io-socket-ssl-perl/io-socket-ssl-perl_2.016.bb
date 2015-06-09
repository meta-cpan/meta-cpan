DESCRIPTION = "IO::Socket::SSL makes using SSL/TLS much easier by wrapping the \
necessary functionality into the familiar IO::Socket interface and providing \
secure defaults whenever possible. This way existing applications can be made \
SSL-aware without much effort, at least if you do blocking I/O and don't use \
select or poll."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/IO-Socket-SSL"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "https://cpan.metacpan.org/authors/id/S/SU/SULLR/IO-Socket-SSL-2.016.tar.gz"

SRC_URI[md5sum] = "a71e9f0f76c7a15a11fef14ca8ef8aa8"
SRC_URI[sha256sum] = "936268b3c152a4900f9c1762ab2e0aa3f84ed3a988e8e60aaad604beda7bfe41"
DEPENDS += "extutils-makemaker-perl-native"
RDEPENDS_${PN} += "net-ssleay-perl"

S = "${WORKDIR}/IO-Socket-SSL-${PV}"

inherit cpan

BBCLASSEXTEND = "native"
