DESCRIPTION = "File::ShareDir::Install allows you to install read-only data files from \
a distribution. It is a companion module to File::ShareDir, which \
allows you \
to locate these files after installation."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/File-ShareDir-Install"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "http://cpan.metacpan.org/authors/id/G/GW/GWYN/File-ShareDir-Install-0.09.tar.gz"

SRC_URI[md5sum] = "508fd1f977f2e160e7e756c9c73868df"
SRC_URI[sha256sum] = "ed4fdbbd691726d45b78538c63eb1b08a7b0853cf07ec327256d0dd590acc0dc"

S = "${WORKDIR}/File-ShareDir-Install-${PV}"



inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
