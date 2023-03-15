DESCRIPTION = "This module removes body in HTTP response, if it's not required."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Plack-Middleware-RemoveRedundantBody"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/S/SW/SWEETKID/Plack-Middleware-RemoveRedundantBody-0.09.tar.gz"

SRC_URI[md5sum] = "75ba53485a1934c30028ca66db1f5e15"
SRC_URI[sha256sum] = "80d45f93d6b7290b0bd8b3cedd84a37fc501456cc3dec02ec7aad81c0018087e"
RDEPENDS:${PN} += "plack-perl"
DEPENDS += "http-message-perl-native"

S = "${WORKDIR}/Plack-Middleware-RemoveRedundantBody-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
