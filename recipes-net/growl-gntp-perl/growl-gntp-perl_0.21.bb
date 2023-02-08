DESCRIPTION = "Growl::GNTP is Perl implementation of GNTP Protocol (Client Part)"

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Growl-GNTP"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/M/MA/MATTN/Growl-GNTP-0.21.tar.gz"

SRC_URI[md5sum] = "cfb18c0e214f5d80fd6e44b68d218b31"
SRC_URI[sha256sum] = "28797f8e427406720584cafd10e780a78ec2b569c555a18743d74553d5f5083f"
RDEPENDS:${PN} += "crypt-cbc-perl"
RDEPENDS:${PN} += "data-uuid-perl"
DEPENDS += "module-build-tiny-perl-native"

S = "${WORKDIR}/Growl-GNTP-${PV}"

inherit cpan_build allarch

BBCLASSEXTEND = "native"
