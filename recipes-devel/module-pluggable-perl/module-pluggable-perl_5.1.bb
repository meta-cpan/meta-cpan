DESCRIPTION = "Provides a simple but, hopefully, extensible way of having \
'plugins' for your module. Obviously this isn't going to be the be all and \
end all of solutions but it works for me."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Module-Pluggable"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "http://cpan.metacpan.org/authors/id/S/SI/SIMONW/Module-Pluggable-5.1.tar.gz"

SRC_URI[md5sum] = "1b71ed7a67ad8c048d1499540bc892ba"
SRC_URI[sha256sum] = "e2dc354043bb16f1f3df8c4bb26070b26e594819f218cf8b8ac19e79c720916f"
DEPENDS += "perl"

S = "${WORKDIR}/Module-Pluggable-${PV}"

inherit cpan_build

BBCLASSEXTEND = "native"
