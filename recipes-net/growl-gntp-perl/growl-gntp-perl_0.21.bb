DESCRIPTION = "Growl::GNTP is Perl implementation of GNTP Protocol (Client Part)"

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Growl-GNTP"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/M/MA/MATTN/Growl-GNTP-0.21.tar.gz"

SRC_URI[md5sum] = "cfb18c0e214f5d80fd6e44b68d218b31"
SRC_URI[sha256sum] = "28797f8e427406720584cafd10e780a78ec2b569c555a18743d74553d5f5083f"
RDEPENDS_${PN} += "crypt-cbc-perl"
RDEPENDS_${PN} += "data-uuid-perl"
DEPENDS += "module-build-tiny-perl-native"

S = "${WORKDIR}/Growl-GNTP-${PV}"

inherit cpan_build allarch

BBCLASSEXTEND = "native"
