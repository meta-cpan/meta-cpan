DESCRIPTION = "Test::Fatal is an alternative to the popular Test::Exception. It does much \
less, but should allow greater flexibility in testing exception-throwing \
code with about the same amount of typing."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Test-Fatal"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/R/RJ/RJBS/Test-Fatal-0.016.tar.gz"

SRC_URI[md5sum] = "da5d864c04a60e71de9ae51b318562fd"
SRC_URI[sha256sum] = "7283d430f2ba2030b8cd979ae3039d3f1b2ec3dde1a11ca6ae09f992a66f788f"
RDEPENDS:${PN} += "try-tiny-perl"

S = "${WORKDIR}/Test-Fatal-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
